package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_43 {
    private final Production94_43 production = new Production94_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}