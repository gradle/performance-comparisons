package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_97 {
    private final Production33_97 production = new Production33_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}