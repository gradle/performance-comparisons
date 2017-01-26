package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_71 {
    private final Production79_71 production = new Production79_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}