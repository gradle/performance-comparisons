package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_172 {
    private final Production33_172 production = new Production33_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}