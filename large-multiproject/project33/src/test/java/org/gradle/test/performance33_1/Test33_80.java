package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_80 {
    private final Production33_80 production = new Production33_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}