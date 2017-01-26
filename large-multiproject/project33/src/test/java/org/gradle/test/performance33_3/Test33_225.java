package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_225 {
    private final Production33_225 production = new Production33_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}