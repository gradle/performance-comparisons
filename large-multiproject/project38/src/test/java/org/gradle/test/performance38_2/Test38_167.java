package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_167 {
    private final Production38_167 production = new Production38_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}