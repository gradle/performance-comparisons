package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_234 {
    private final Production64_234 production = new Production64_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}