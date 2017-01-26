package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_209 {
    private final Production23_209 production = new Production23_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}