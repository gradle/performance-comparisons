package org.gradle.test.performance33_4;

import static org.junit.Assert.*;

public class Test33_347 {
    private final Production33_347 production = new Production33_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}