package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_172 {
    private final Production38_172 production = new Production38_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}