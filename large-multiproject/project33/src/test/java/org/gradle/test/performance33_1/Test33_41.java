package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_41 {
    private final Production33_41 production = new Production33_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}