package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_267 {
    private final Production33_267 production = new Production33_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}