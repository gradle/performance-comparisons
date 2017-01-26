package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_445 {
    private final Production38_445 production = new Production38_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}