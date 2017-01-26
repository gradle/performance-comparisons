package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_282 {
    private final Production94_282 production = new Production94_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}