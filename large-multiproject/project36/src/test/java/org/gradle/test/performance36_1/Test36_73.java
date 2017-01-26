package org.gradle.test.performance36_1;

import static org.junit.Assert.*;

public class Test36_73 {
    private final Production36_73 production = new Production36_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}