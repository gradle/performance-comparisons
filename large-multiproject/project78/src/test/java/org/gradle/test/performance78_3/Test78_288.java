package org.gradle.test.performance78_3;

import static org.junit.Assert.*;

public class Test78_288 {
    private final Production78_288 production = new Production78_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}