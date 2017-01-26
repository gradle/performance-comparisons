package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_268 {
    private final Production23_268 production = new Production23_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}