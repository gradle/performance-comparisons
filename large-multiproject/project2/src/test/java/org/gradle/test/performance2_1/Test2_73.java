package org.gradle.test.performance2_1;

import static org.junit.Assert.*;

public class Test2_73 {
    private final Production2_73 production = new Production2_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}