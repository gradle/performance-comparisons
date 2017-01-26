package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_234 {
    private final Production22_234 production = new Production22_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}