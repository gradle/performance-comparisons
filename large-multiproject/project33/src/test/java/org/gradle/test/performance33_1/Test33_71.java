package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_71 {
    private final Production33_71 production = new Production33_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}