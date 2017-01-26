package org.gradle.test.performance33_3;

import static org.junit.Assert.*;

public class Test33_234 {
    private final Production33_234 production = new Production33_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}