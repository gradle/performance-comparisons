package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_257 {
    private final Production23_257 production = new Production23_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}