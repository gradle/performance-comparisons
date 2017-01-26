package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_324 {
    private final Production19_324 production = new Production19_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}