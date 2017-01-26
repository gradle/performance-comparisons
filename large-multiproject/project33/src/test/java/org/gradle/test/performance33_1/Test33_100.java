package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_100 {
    private final Production33_100 production = new Production33_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}