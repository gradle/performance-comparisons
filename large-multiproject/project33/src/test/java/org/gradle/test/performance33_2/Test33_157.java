package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_157 {
    private final Production33_157 production = new Production33_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}