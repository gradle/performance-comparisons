package org.gradle.test.performance33_1;

import static org.junit.Assert.*;

public class Test33_73 {
    private final Production33_73 production = new Production33_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}