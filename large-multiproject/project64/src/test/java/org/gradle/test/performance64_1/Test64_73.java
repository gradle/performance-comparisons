package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_73 {
    private final Production64_73 production = new Production64_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}