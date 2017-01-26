package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_166 {
    private final Production23_166 production = new Production23_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}