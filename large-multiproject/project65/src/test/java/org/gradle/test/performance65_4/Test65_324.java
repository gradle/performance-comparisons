package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_324 {
    private final Production65_324 production = new Production65_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}