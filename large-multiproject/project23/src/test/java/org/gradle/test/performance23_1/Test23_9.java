package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_9 {
    private final Production23_9 production = new Production23_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}