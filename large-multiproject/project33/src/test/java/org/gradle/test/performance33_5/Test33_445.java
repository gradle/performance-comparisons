package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_445 {
    private final Production33_445 production = new Production33_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}