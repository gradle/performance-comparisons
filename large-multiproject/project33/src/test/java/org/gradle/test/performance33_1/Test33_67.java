package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_67 {
    private final Production33_67 production = new Production33_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}