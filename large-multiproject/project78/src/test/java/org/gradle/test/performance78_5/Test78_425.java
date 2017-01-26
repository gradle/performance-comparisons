package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_425 {
    private final Production78_425 production = new Production78_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}