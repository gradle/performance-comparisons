package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_62 {
    private final Production33_62 production = new Production33_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}