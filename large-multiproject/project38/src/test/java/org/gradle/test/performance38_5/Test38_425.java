package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_425 {
    private final Production38_425 production = new Production38_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}