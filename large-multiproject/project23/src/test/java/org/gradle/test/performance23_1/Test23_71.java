package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_71 {
    private final Production23_71 production = new Production23_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}