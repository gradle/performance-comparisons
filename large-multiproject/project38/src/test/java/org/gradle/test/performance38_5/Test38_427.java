package org.gradle.test.performance38_5;

import static org.junit.Assert.*;

public class Test38_427 {
    private final Production38_427 production = new Production38_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}