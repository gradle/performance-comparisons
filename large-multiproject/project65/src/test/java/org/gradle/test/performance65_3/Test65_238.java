package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_238 {
    private final Production65_238 production = new Production65_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}