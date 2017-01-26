package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_85 {
    private final Production66_85 production = new Production66_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}