package org.gradle.test.performance2_3;

import static org.junit.Assert.*;

public class Test2_288 {
    private final Production2_288 production = new Production2_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}