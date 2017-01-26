package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_78 {
    private final Production33_78 production = new Production33_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}