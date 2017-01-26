package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_246 {
    private final Production23_246 production = new Production23_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}