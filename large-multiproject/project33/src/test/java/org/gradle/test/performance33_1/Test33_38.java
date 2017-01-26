package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_38 {
    private final Production33_38 production = new Production33_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}