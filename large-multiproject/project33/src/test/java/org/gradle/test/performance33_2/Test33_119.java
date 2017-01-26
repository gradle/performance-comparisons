package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_119 {
    private final Production33_119 production = new Production33_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}