package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_347 {
    private final Production94_347 production = new Production94_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}