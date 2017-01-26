package org.gradle.test.performance91_3;

import static org.junit.Assert.*;

public class Test91_234 {
    private final Production91_234 production = new Production91_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}