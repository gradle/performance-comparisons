package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_172 {
    private final Production94_172 production = new Production94_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}