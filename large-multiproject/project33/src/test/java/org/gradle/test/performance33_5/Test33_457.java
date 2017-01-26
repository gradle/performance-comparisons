package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_457 {
    private final Production33_457 production = new Production33_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}