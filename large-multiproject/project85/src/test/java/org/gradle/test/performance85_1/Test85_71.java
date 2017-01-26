package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_71 {
    private final Production85_71 production = new Production85_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}