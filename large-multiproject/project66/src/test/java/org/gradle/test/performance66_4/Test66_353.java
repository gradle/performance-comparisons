package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_353 {
    private final Production66_353 production = new Production66_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}