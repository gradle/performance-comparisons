package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_89 {
    private final Production33_89 production = new Production33_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}