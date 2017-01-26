package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_498 {
    private final Production38_498 production = new Production38_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}