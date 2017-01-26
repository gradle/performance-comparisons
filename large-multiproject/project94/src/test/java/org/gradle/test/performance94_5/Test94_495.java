package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_495 {
    private final Production94_495 production = new Production94_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}