package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_49 {
    private final Production94_49 production = new Production94_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}