package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_209 {
    private final Production33_209 production = new Production33_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}