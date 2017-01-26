package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_255 {
    private final Production38_255 production = new Production38_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}