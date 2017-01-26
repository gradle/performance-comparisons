package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_288 {
    private final Production23_288 production = new Production23_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}