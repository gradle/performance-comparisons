package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_353 {
    private final Production97_353 production = new Production97_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}